package pokemonGym

/**
 * Created by leandromoras on 6/8/15.
 */
abstract class Pokemon {

  var level: Int = 1;
  var experience: Int = 0;
  val energy: Int = 0;
  val Genre: Char;
  val maxEnergy: Int;
  val weight: Int;
  val strenght: Int;
  val velocity: Int;
  val species: PokemonSpecies;
 // val listPrimaryAttacks: List[Attack];
 // val listSecundaryAttacks: List[Attack];
 
  def winExperience(xp: Int): Unit = {
    
    var experienceSum: Int = /*sumatoriaExperiencia... foldl/r?? No se como es en scala... (Saludos, Seba)*/;
    
    this.experience += xp;
    
    if (this.experience >= experienceSum) this.level += 1;
    
  }
  
}

