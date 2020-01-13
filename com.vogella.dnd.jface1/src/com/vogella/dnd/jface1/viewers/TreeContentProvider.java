package com.vogella.dnd.jface1.viewers;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class TreeContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getChildren(Object parentElement) {
        return null;
    }

    @Override
    public Object getParent(Object element) {
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        return false;
    }

    @Override
    public Object[] getElements(Object inputElement) {
        @SuppressWarnings("unchecked")
        List<String> list = (List<String>) inputElement;
        return list.toArray();
    }
}