package presentacion;

import javax.swing.*;
import java.awt.*;

class SesionDoctorRender implements ListCellRenderer {
	protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
	
	ImageIcon LogOutIcon;
	
	public SesionDoctorRender () {
		LogOutIcon = new ImageIcon(SesionDoctorRender.class.getResource("icons/medics_img/SignOut_red_16x16.png"));
	}
	
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus)
	{
		JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
		if (list.getModel().getElementAt(index) == "Cerrar sesión") {
			renderer.setIcon(LogOutIcon);
		}
		return renderer;
	}
}