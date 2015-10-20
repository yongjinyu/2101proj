import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.ComboBoxUI;

public class DropdownPaneComponent extends JPanel {
	String[] calcStrings = { "BMI", "BMR", "BFP", "Weight Loss"};
    private JTabbedPane pane;

    public DropdownPaneComponent(JTabbedPane pane) {
        //unset default FlowLayout' gaps
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        setOpaque(false);
        
        //make JLabel read titles from JTabbedPane
        JLabel label = new JLabel() {
            public String getText() {
                int i = pane.indexOfTabComponent(DropdownPaneComponent.this);
                if (i != -1) {
                    return pane.getTitleAt(i);
                }
                return null;
            }
        };
        
        add(label);
        //add more space between the label and the button
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        //tab button
        JComboBox jcbCalcs = new TabButton();
        add(jcbCalcs);
        //add more space to the top of the component
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }
    
    private class TabButton extends JComboBox  {
        public TabButton() {
        	super(calcStrings);
             setToolTipText("close this tab");
             //Make the button looks the same for all Laf's
           
             //Make it transparent
            
             //No need to be focusable
             setFocusable(false);
             setBorder(BorderFactory.createEtchedBorder());

        	
        }
    }
 }

