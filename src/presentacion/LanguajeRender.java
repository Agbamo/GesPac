package presentacion;
import javax.swing.*;
import java.awt.*;

class LanguajeRender implements ListCellRenderer {
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	
	ImageIcon SpanishLangIcon;
	ImageIcon EnglishLangIcon;
	
	public LanguajeRender () {
		SpanishLangIcon = new ImageIcon(LanguajeRender.class.getResource("icons/languaje_flags/banderaEsp.gif"));
		EnglishLangIcon = new ImageIcon(LanguajeRender.class.getResource("icons/languaje_flags/banderaIng.gif"));
	}
	
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus)
	{
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
		if (list.getModel().getElementAt(index) == "Español") {
			renderer.setIcon(SpanishLangIcon);
		} else
			if (list.getModel().getElementAt(index) == "English"){
				renderer.setIcon(EnglishLangIcon);
			}
		return renderer;
	}
}