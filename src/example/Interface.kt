package example

interface Movable{
    val model: String
    val number: String
    var speed: Int
    fun move()
    fun stop() {
        println("Останавливаемся...")
    }
}

class Car(
    override val model: String,
    override val number: String
) : Movable{
    override var speed: Int = 60
    override fun move() {
        println("Едем на машине")
    }
}
class AirCraft(
    override val model: String,
    override val number: String
) : Movable{
    override var speed: Int = 600
    override fun move() {
        println("Летим на самолёте")
    }

    override fun stop() {
        println("Приземляемся")
    }
}
fun travel(obj: Movable) = obj.move()

interface Worker{
    fun work()
}
interface Student{
    fun study()
}
class WorkingStudent(val name:String): Worker, Student {
    override fun work() {
        println("$name работает")
    }
    override fun study() {
        println("$name учится")
    }
}
interface VideoPlayable {
    fun play() = println("Play video")
}
interface AudioPlayable {
    fun play() = println("Play audio")
}
class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play() {
        println("Start playing")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}
fun main() {
    val car = Car("LADA", "134LAD")
    val airCraft = AirCraft("Boeing","737")
//    car.move()
//    airCraft.move()
//    example.travel(car)
//    example.travel(airCraft)
    val artem = WorkingStudent("Артем")
//    artem.work()
//    artem.study()
    val player = MediaPlayer()
    player.play()
}