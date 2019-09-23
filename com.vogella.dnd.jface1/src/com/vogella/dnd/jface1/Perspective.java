package com.vogella.dnd.jface1;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;



public class Perspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		  layout.setEditorAreaVisible(true);
	        layout.addStandaloneView(TreeView.ID, false, IPageLayout.LEFT, .20f, layout.getEditorArea());
	}

}
