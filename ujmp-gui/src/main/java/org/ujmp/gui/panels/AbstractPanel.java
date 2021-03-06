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

package org.ujmp.gui.panels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.ToolTipManager;

import org.ujmp.core.interfaces.GUIObject;
import org.ujmp.core.interfaces.HasToolTip;
import org.ujmp.gui.interfaces.CanBeRepainted;
import org.ujmp.gui.io.ExportJPEG;
import org.ujmp.gui.io.ExportPDF;
import org.ujmp.gui.io.ExportPNG;

public abstract class AbstractPanel extends JPanel implements HasToolTip, CanBeRepainted {
	private static final long serialVersionUID = 4748216534779867441L;

	private final GUIObject guiObject;

	public AbstractPanel(GUIObject o) {
		this.guiObject = o;
		setDoubleBuffered(true);
		setPreferredSize(new Dimension(800, 600));
		setSize(new Dimension(800, 600));
		setLayout(new BorderLayout());
		ToolTipManager.sharedInstance().registerComponent(this);
	}

	public void paintToBuffer(BufferedImage image) {
	}

	public GUIObject getGUIObject() {
		return guiObject;
	}

	protected void finalize() throws Throwable {
		ToolTipManager.sharedInstance().unregisterComponent(this);
		super.finalize();
	}

	public final void exportToJPEG(File file) {
		ExportJPEG.save(file, this);
	}

	public final void exportToPDF(File file) {
		ExportPDF.save(file, this);
	}

	public final void exportToPNG(File file) {
		ExportPNG.save(file, this);
	}

	public String getToolTipText() {
		return guiObject.getToolTipText();
	}

	public void repaintUI() {

	}
}
