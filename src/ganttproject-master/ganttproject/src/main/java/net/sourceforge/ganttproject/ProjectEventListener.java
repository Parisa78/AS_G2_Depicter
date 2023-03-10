/*
GanttProject is an opensource project management tool. License: GPL3
Copyright (C) 2005-2011 Dmitry Barashev

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 3
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package net.sourceforge.ganttproject;

import net.sourceforge.ganttproject.document.Document;
import biz.ganttproject.app.BarrierEntrance;
import biz.ganttproject.app.Barrier;

public interface ProjectEventListener {
  void projectModified();

  void projectSaved();

  void projectClosed();

  void projectOpened(BarrierEntrance barrierRegistry, Barrier<IGanttProject> barrier);

  void projectCreated();

  void projectRestoring(Barrier<Document> completion);

  class Stub implements ProjectEventListener {
    @Override
    public void projectModified() {
    }

    @Override
    public void projectSaved() {
    }

    @Override
    public void projectClosed() {
    }

    @Override
    public void projectOpened(BarrierEntrance barrierRegistry, Barrier<IGanttProject> barrier) {
    }

    @Override
    public void projectCreated() {
    }

    @Override
    public void projectRestoring(Barrier<Document> completion) {

    }
  }
}
