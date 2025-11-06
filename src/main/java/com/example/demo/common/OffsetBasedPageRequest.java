package com.example.demo.common;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class OffsetBasedPageRequest implements Pageable {
    private final int limit;
    private final long offset;
    private final Sort sort;

    public OffsetBasedPageRequest(long offset, int limit) {
        this(offset, limit, Sort.unsorted());
    }

    public OffsetBasedPageRequest(long offset, int limit, @Nullable Sort sort) {
        if (offset < 0) {
            throw new IllegalArgumentException("Offset index must not be less than zero!");
        }
        if (limit < 1) {
            throw new IllegalArgumentException("Limit must not be less than one!");
        }
        this.limit = limit;
        this.offset = offset;
        this.sort = sort == null ? Sort.unsorted() : sort;
    }

    @Override
    public int getPageNumber() {
        return (int) (offset / limit);
    }

    @Override
    public int getPageSize() {
        return limit;
    }

    @Override
    public long getOffset() {
        return offset;
    }

    @Override
    @NonNull
    public Sort getSort() {
        return sort;
    }

    @Override
    @NonNull
    public Pageable next() {
        return new OffsetBasedPageRequest(getOffset() + getPageSize(), getPageSize(), getSort());
    }

    @Override
    @NonNull
    public Pageable previousOrFirst() {
        long newOffset = getOffset() - getPageSize();
        if (newOffset < 0) {
            newOffset = 0;
        }
        return new OffsetBasedPageRequest(newOffset, getPageSize(), getSort());
    }

    @Override
    @NonNull
    public Pageable first() {
        return new OffsetBasedPageRequest(0, getPageSize(), getSort());
    }

    @Override
    public Pageable withPage(int pageNumber) {
        if (pageNumber < 0) {
            throw new IllegalArgumentException("Page index must not be less than zero!");
        }
        return new OffsetBasedPageRequest((long) pageNumber * getPageSize(), getPageSize(), getSort());
    }

    @Override
    public boolean hasPrevious() {
        return offset > 0;
    }
}
