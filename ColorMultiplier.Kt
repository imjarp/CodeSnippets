val color = ("041E41").toLong(radix=16) 
val r = (color shr  16) and 0xFF
val g = (color shr  8) and 0xFF
val b = (color shr  0) and 0xFF
println("color1 " + color)
println("r " + r)
println("g " + g)
println("b " + b)
    
val color2 = ("99999A").toLong(radix=16) 
val r2 = (color2 shr  16) and 0xFF
val g2 = (color2 shr  8) and 0xFF
val b2 = (color2 shr  0) and 0xFF

println("color2 " + color2)
println("r " + r2)
println("g " + g2)
println("b " + b2)

val resultR =   (r*r2 /255) 
val resultG =  (g*g2 /255) 
val resultB =  (b*b2 /255 ) 

println("result color")
println("r " + resultR)
println("g " + resultG)
println("b " + resultB)
