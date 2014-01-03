package gui.listener;

import gui.make.take.LimbSquare;

import java.awt.Cursor;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.io.IOException;

public class DragGestureListImp implements DragGestureListener {

	DataFlavor dataFlavor = new DataFlavor(LimbSquare.class,
			LimbSquare.class.getSimpleName());

	public void dragGestureRecognized(DragGestureEvent event) {
		Cursor cursor = null;
		LimbSquare square = (LimbSquare) event.getComponent();

		if (event.getDragAction() == DnDConstants.ACTION_COPY) {
			cursor = DragSource.DefaultCopyDrop;
		}

		event.startDrag(cursor, new TransferableSquare(square));
	}

	class TransferableSquare implements Transferable {

		private LimbSquare square;

		public TransferableSquare(LimbSquare sq) {
			this.square = sq;
		}

		public DataFlavor[] getTransferDataFlavors() {
			return new DataFlavor[] { dataFlavor };
		}

		public boolean isDataFlavorSupported(DataFlavor flavor) {
			return flavor.equals(dataFlavor);
		}

		public Object getTransferData(DataFlavor flavor)
				throws UnsupportedFlavorException, IOException {

			if (flavor.equals(dataFlavor))
				return square;
			else
				throw new UnsupportedFlavorException(flavor);
		}
	}
}
