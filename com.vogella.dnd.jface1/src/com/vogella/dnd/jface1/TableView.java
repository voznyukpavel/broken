package com.vogella.dnd.jface1;



import javax.annotation.PostConstruct;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.vogella.dnd.jface1.dnd.MyDragListener;
import com.vogella.dnd.jface1.model.ContentProvider;
import com.vogella.dnd.jface1.viewers.TableContentProvider;
import com.vogella.dnd.jface1.viewers.TableLabelProvider;

public class TableView extends ViewPart{
  public static final String ID = "com.vogella.dnd.jface1.TableView";

    @PostConstruct
    public void createPartControl(Composite parent) {
        TableViewer viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL);
        int operations = DND.DROP_COPY| DND.DROP_MOVE;
        Transfer[] transferTypes = new Transfer[]{TextTransfer.getInstance()};
        
        viewer.addDragSupport(operations, transferTypes , new MyDragListener(viewer));
        
        viewer.setContentProvider(new TableContentProvider());
        viewer.setLabelProvider(new TableLabelProvider());
        viewer.setInput(ContentProvider.INSTANCE.getModel());
      
    }
  //  private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TableView.class);
  @Override
  public void setFocus() {
     
   //   logger.info("this is log");
   //    logger.error("this is log");
   //    logger.fatal("this is log");
  }
}