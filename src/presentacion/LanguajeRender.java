package presentacion;
import javax.swing.*;
import java.awt.*;

class LanguajeRender extends JLabel implements ListCellRenderer {
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	
	ImageIcon SpanishLangIcon;
	ImageIcon EnglishLangIcon;
	
	public LanguajeRender () {
		SpanishLangIcon = new ImageIcon(LanguajeRender.class.getResource("icons/languaje_flags/banderaEsp.gif"));
		EnglishLangIcon = new ImageIcon(LanguajeRender.class.getResource("icons/languaje_flags/banderaIng.gif"));
	}
	
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus)
	{
		if (value == "Español") {
			setIcon (SpanishLangIcon);
			setText("Español");
		} else {
			setIcon (EnglishLangIcon);
			setText("English");
		}
	    return this;
	}
}