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
package block
package traits

import net.minecraft.world.World
import net.minecraft.item.ItemStack
import net.minecraft.item.Item
import net.minecraft.util.IIcon
import net.minecraft.client.renderer.texture.IIconRegister
import cpw.mods.fml.relauncher.SideOnly
import cpw.mods.fml.relauncher.Side

trait RotatedBlock extends BaseBlock with TopTexture with SideTexture {

  override val getRenderType = 31

  override def onBlockPlaced(world: World, p_149660_2_ : Int, p_149660_3_ : Int, p_149660_4_ : Int, p_149660_5_ : Int, p_149660_6_ : Float, p_149660_7_ : Float, p_149660_8_ : Float, p_149660_9_ : Int) = {
    val j1 = p_149660_9_ & 3;
    val b0 = p_149660_5_ match {
      case 0 | 1 => 0
      case 2 | 3 => 8
      case 4 | 5 => 4
    }

    j1 | b0;
  }

  @SideOnly(Side.CLIENT)
  override def getIcon(p_149691_1_ : Int, p_149691_2_ : Int) = {
    val k = p_149691_2_ & 12;
    val l = p_149691_2_ & 3;
    k match {
      case 0 if p_149691_1_ == (0 | 1) => getTopIcon(l)
      case 4 if p_149691_1_ == (4 | 5) => getTopIcon(l)
      case 8 if p_149691_1_ == (2 | 3) => getTopIcon(l)
      case _ => getSideIcon(l)
    }
  }

  override def damageDropped(p_149692_1_ : Int) = p_149692_1_ & 3

  def func_150162_k(p_150162_1_ : Int) = p_150162_1_ & 3

  override def createStackedBlock(p_149644_1_ : Int) = new ItemStack(Item.getItemFromBlock(this), 1, this.func_150162_k(p_149644_1_))
}