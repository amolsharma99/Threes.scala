package com.micahw.threes

sealed abstract class Tile

case object Blank extends Tile
case object OneTile extends Tile
case object TwoTile extends Tile
case class ThreeTile(power : Int) extends Tile

object Tile {
  def value(t : Tile) = t match {
    case Blank => 0
    case OneTile => 1
    case TwoTile => 2
    case ThreeTile(power) => 3 * (1 << power)
  }
}

class Board(val board : List[List[Tile]]) {
  override def toString = {
    board.map { row =>
      row.map(Tile.value).map(_.toString).mkString("\t")
    }.mkString("\t")
  }
}

object Board {
  def random = {
    val pieces = List(Blank)
  }
}

class Game {

}

object Game {
  def main(args : Array[String]) = {
    println(s"0: ${Tile.value(ThreeTile(0))}")
  }
}
