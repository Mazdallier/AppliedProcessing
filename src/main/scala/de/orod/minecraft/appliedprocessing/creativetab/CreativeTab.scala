/*
 * Applied Processing
 * Copyright 2014 yueh
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.orod.minecraft
package appliedprocessing
package creativetab

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

import init.ModItems
import init.ModBlocks
import reference._

object CreativeTab {
  val AP_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
    override def getTabIconItem = ModItems.skywoodDust
  }
}
