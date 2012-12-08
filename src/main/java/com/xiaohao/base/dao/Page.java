package com.xiaohao.base.dao;

import java.util.List;


/**
 * Page is not a domain object but is used to store and fetch page information.
 * 
 * @author andy.li
 */
public class Page<T> {
	
	public final static int DEFAULT_PAGE_SIZE=10; 
	
    private int total;
    private List<T> items;   //分页集合

    private int pageIndex;
    private int pageSize;
    private int pageCount;
    
    public Page(int pageIndex, int pageSize) {
        // check:
        if(pageIndex<1)
            pageIndex = 1;
        if(pageSize<1)
            pageSize = 1;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public Page(List<T> items,
                int totalCount, int pageSize, int pageIndex){
        // check:
        if(pageIndex<1)
            pageIndex = 1;
        if(pageSize<1)
            pageSize = 1;
        this.total = totalCount;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.items=items;
    }
    
    public Page(int pageIndex) {
        this(pageIndex, DEFAULT_PAGE_SIZE);
    }

    public int getPageIndex() { return pageIndex; }

    public int getPageSize() { return pageSize; }

    public int getPageCount() { return pageCount; }

    public int getTotalCount() { return total; }

    public int getFirstResult() { return (pageIndex-1)*pageSize; }

    public boolean getHasPrevious() { return pageIndex>1; }

    public boolean getHasNext() { return pageIndex<pageCount; }

    public void setTotalCount(int total) {
        this.total = total;
        pageCount = total / pageSize + (total%pageSize==0 ? 0 : 1);
        // adjust pageIndex:
        if(total==0) {
            if(pageIndex!=1)
                throw new IndexOutOfBoundsException("Page index out of range.");
        }
        else {
            if(pageIndex>pageCount)
                throw new IndexOutOfBoundsException("Page index out of range.");
        }
    }

    public boolean isEmpty() {
        return total==0;
    }
	public List getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
    
	public int getTotal() {
	
		return total;
	}

	
	public void setTotal(int total) {
	
		this.total = total;
	}

	public Page() { }
}
