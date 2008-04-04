package org.pentaho.ui.xul.components;

import org.pentaho.ui.xul.XulComponent;

public interface XulTreeCell extends XulComponent {
  
  public void setEditable(boolean edit);
  public boolean isEditable();
  
  public void setLabel(String label);
  public String getLabel();

  public void setSrc(String srcUrl);
  public String getSrc();
  
  public void setValue(Object value);
  public Object getValue();
  
}
