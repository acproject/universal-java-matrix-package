/*
 * Copyright (C) 2008-2015 by Holger Arndt
 *
 * This file is part of the Universal Java Matrix Package (UJMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * UJMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * UJMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with UJMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.ujmp.gui.table;

import java.util.Enumeration;

import javax.swing.table.TableColumnModel;

public interface TableColumnModel64 extends TableColumnModel {

	public void addColumn(TableColumn64 aColumn);

	public void removeColumn(TableColumn64 column);

	public void moveColumn(long columnIndex, long newIndex);

	public long getColumnCount64();

	public Enumeration<TableColumn64> getColumns64();

	public long getColumnIndex64(Object columnIdentifier);

	public TableColumn64 getColumn(long columnIndex);

	public long[] getSelectedColumns64();

	public long getSelectedColumnCount64();

	public void setSelectionModel(ListSelectionModel64 newModel);

	public ListSelectionModel64 getSelectionModel();

	public void addColumnModelListener(TableColumnModelListener64 x);

	public void removeColumnModelListener(TableColumnModelListener64 x);

	public long getColumnIndexAtX(long xPosition);

	public int getColumnWidth(long i);

	public int getDefaultColumnWidth();

	public void setDefaultColumnWidth(int width);

	public void setColumnWidth(long index, int width);

}
