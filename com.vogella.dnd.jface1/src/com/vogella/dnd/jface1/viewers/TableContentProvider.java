package com.vogella.dnd.jface1.viewers;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;

import com.vogella.dnd.jface1.model.Todo;

public class TableContentProvider implements IStructuredContentProvider {

    @Override
    public Object[] getElements(Object inputElement) {
        @SuppressWarnings("unchecked")
        List<Todo> list = (List<Todo>) inputElement;
        return list.toArray();
    }

}
