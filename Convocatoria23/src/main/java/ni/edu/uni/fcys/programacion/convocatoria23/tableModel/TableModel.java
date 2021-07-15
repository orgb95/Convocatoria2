/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion.convocatoria23.tableModel;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import ni.edu.uni.fcys.programacion.convocatoria23.Pojo.FNE;

/**
 *
 * @author Sistemas-05
 */
public class TableModel  extends AbstractTableModel implements PropertyChangeListener{
    private List<FNE> data;
    private final String[] columnNames;
    
    public TableModel(List<FNE> data, String[] columnNames) {
        this.data = data;
        this.columnNames = columnNames;
    }
     public void add(FNE f){
        this.data.add(f);
    }
    @Override
    public int getRowCount() {
         return data == null ? 0 : data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames == null ? 0 : columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data == null ? null : data.isEmpty() ? null : data.get(rowIndex).asArray()[columnIndex];
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        add((FNE)evt.getNewValue());
        fireTableDataChanged();
    }
    
}
