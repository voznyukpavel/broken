package com.vogella.dnd.jface1;

import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.vogella.dnd.jface1.dnd.MyDropListener;
import com.vogella.dnd.jface1.model.ContentProviderTree;
import com.vogella.dnd.jface1.viewers.TreeContentProvider;
import com.vogella.dnd.jface1.viewers.TreeLabelProvider;

public class TreeView extends ViewPart {
	public static final String ID = "com.vogella.dnd.jface1.TteeView";

	@PostConstruct
	public void createPartControl(Composite parent) {
		TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	
		int operations = DND.DROP_COPY | DND.DROP_MOVE;
		Transfer[] transferTypes = new Transfer[] { TextTransfer.getInstance() };
		
		viewer.addDropSupport(operations, transferTypes, new MyDropListener(viewer));
		viewer.setContentProvider(new TreeContentProvider());
		viewer.setLabelProvider(new TreeLabelProvider());
		viewer.setInput(ContentProviderTree.INSTANCE.getModel());
	}

	@Override
	public void setFocus() {
	}
}
