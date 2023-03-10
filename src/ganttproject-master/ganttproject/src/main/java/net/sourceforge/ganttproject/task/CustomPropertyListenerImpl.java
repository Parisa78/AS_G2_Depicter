/*
GanttProject is an opensource project management tool. License: GPL3
Copyright (C) 2011 Dmitry Barashev

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
package net.sourceforge.ganttproject.task;

import biz.ganttproject.customproperty.CustomPropertyDefinition;
import biz.ganttproject.customproperty.CustomPropertyEvent;
import biz.ganttproject.customproperty.CustomPropertyListener;

class CustomPropertyListenerImpl implements CustomPropertyListener {
  private final TaskManagerImpl myTaskManager;

  CustomPropertyListenerImpl(TaskManagerImpl taskManagerImpl) {
    myTaskManager = taskManagerImpl;
  }

  @Override
  public void customPropertyChange(CustomPropertyEvent event) {
    switch (event.getType()) {
    case CustomPropertyEvent.EVENT_REMOVE:
      removeCustomPropertyValues(event.getDefinition());
      break;
    }
  }

  private void removeCustomPropertyValues(CustomPropertyDefinition definition) {
    for (Task t : myTaskManager.getTasks()) {
      t.getCustomValues().removeCustomColumn(definition);
    }
  }

}
