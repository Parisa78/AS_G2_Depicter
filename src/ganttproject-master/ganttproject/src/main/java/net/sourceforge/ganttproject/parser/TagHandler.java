/*
Copyright 2003-2012 Dmitry Barashev, GanttProject Team

This file is part of GanttProject, an opensource project management tool.

GanttProject is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

GanttProject is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with GanttProject.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.ganttproject.parser;

import biz.ganttproject.core.io.XmlProject;
import org.xml.sax.Attributes;

public interface TagHandler {
  public boolean hasCdata();

  public void appendCdata(String cdata);

  /** Method when start to parse an attribute */
  public void startElement(String namespaceURI, String sName, String qName, Attributes attrs)
      throws FileFormatException;

  /** Method when finish to parse an attribute */
  public void endElement(String namespaceURI, String sName, String qName);

  default void process(XmlProject xmlProject) {}
}
