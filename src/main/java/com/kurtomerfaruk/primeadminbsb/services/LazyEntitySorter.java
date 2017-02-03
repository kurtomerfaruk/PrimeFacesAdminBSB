package com.kurtomerfaruk.primeadminbsb.services;

import java.util.Comparator;
import org.primefaces.model.SortOrder;

/**
 *
 * @param <T>
 */
public class LazyEntitySorter<T> implements Comparator<T> {

    private final String sortField;
    private final SortOrder sortOrder;

    /**
     *
     * @param sortField
     * @param sortOrder
     */
    public LazyEntitySorter(String sortField, SortOrder sortOrder) {
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(T entity1, T entity2) {
        try {
            Object value1 = EntityUtility.getFieldValue(entity1, sortField);
            Object value2 = EntityUtility.getFieldValue(entity2, sortField);

            int value = ((Comparable) value1).compareTo(value2);

            return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
        } catch (SecurityException | IllegalArgumentException e) {
            throw new RuntimeException();
        }
    }

}
