# ProcessingJS Documentation
Copied from the bottom of
https://www.khanacademy.org/computer-programming/new/pjs
Click links to learn more.

## Shapes
**rect(x, y, w, h)**

**ellipse(x, y, w, h)**

**triangle(x1, y1, x2, y2, x3, y3)**

**line(x1, y1, x2, y2)**

**point(x, y)**

**arc(x, y, w, h, start, stop)**

**bezier(x1, y1, cx1, cy1, cx2, cy2, x2, y2)**

**quad(x1, y1, x2, y2, x3, y3, x4, y4)**

**image(image, x, y, (width, height))**

	(Use loadImage(url))

See also: **ellipseMode, rectMode, imageMode, strokeCap, bezierPoint, bezierTangent, curve, curvePoint, curveTangent, curveTightness**

## Complex Shapes
**beginShape(MODE) / endShape(MODE) / vertex(x, y)**

**curveVertex(x, y)**

**bezierVertex(cx1, cy1, cx2, cy2, x, y)**

See also: **strokeJoin, curveTightness**



## Colors
**background(r, g, b)**

 	Set the background color
 	
**fill(r, g, b)**

 	Set the fill color for shapes
 	
**noFill()**

 	Turn off fill for shapes
 	
**stroke(r, g, b)**

 	Set the outline color for shapes
 	
**strokeWeight(thickness)**

 	Change the thickness of lines and outlines
 	
**noStroke()**

 	Turn off outlines for shapes
 	
**color(r, g, b)**

 	Store a color in a variable
 	
**blendColor(c1, c2, MODE)**

 	Blend two colors together
 	
**lerpColor(c1, c2, amount)**

	Find color between 2 colors
	
See also: **colorMode, red, green, blue, alpha, hue, saturation, brightness**


## Text
**text(text, x, y)**

 	Draw some text
 	
**textFont(font, (size))**

 	Changes the font of text
 	
**textSize(size)**

 	Change the size of text
 	
See also: **textWidth, textAscent, textDescent, textLeading, textAlign**

## Transforms
**rotate(angle)**

 	Rotate shapes by an angle
 	
**scale(amount)**

 	Scale shapes in both dimensions
 	
**translate(x, y)**

	Translate shapes by an offset
	
See also: **pushMatrix/popMatrix, resetMatrix, printMatrix**

## Environment
**width / height**

	The size of the canvas
	
**draw = function() { };**

	Called repeatedly during program execution.
	
**playSound(sound)**

	Plays one of the allowed sounds. (Use loadSound(url))
	
See also: **Program.assertEqual, Program.restart, frameRate(fps), frameCount, loop / noLoop**

## Mouse
**mouseX, mouseY**

	Current coordinates of the mouse
	
**pmouseX, pmouseY**

	Past coordinates of the mouse
	
**mouseButton**

	Which button is pressed
	
**mouseIsPressed**

	Whether mouse is being pressed
	
**mouseClicked = function() { };**

	Called when mouse is clicked
	
**mousePressed = function() { };**

	Called when mouse is pressed
	
**mouseReleased = function() { };**

	Called when mouse is released
	
**mouseMoved = function() { };**

	Called when mouse is moved
	
**mouseDragged = function() { };**

	Called when mouse is dragged
	
**mouseOver = function() { };**

	Called when mouse moves over canvas
	
**mouseOut = function() { };**

	Called when mouse moves out of canvas
	

## Keyboard
**key**

	Number representing which key is pressed
	
**keyCode**

	Represents when a special key is pressed
	
**keyIsPressed**

	True if a key is being pressed, false otherwise
	
**keyPressed = function() { };**

 	Called when a key is pressed
 	
**keyReleased = function() { };**

	Called when a key is released
	
**keyTyped = function() { };**

 	Called when a key is typed

## Math
**random(low, high*)**

	Generate a random number
	
**dist(x1, y1, x2, y2)**

	Calculates the distance between two points
	
**constrain(value, min, max)**

	Constrain value between min and max
	
**min(num1, num2)**

	Return the minimum of two numbers
	
**max(num1, num2)**

	Return the maximum of two numbers
	
**abs(num)**

 	Take the absolute value of a number
 	
**log(num)**

 	Take the logarithm of a number
 	
**pow(num, exponent)**

	Raise a number to an exponent
	
**sq(num)**

	Square a number
	
**sqrt(num)**

	Take the square root of a number
	
**round(num)**

	Return nearest integer
	
**ceil(num)**

	Return nearest integer of greater/equal value
	
**floor(num)**

	Return nearest integer of lesser/equal value
	
**PVector(x, y)**

	An object that describes a 2-dimensional vector (or 3-dimensional)
	
See also: **mag, exp, map, norm, lerp, noise, noiseDetail, Random.nextGaussian**

## Trigonometry
**cos(degrees)**

	Take the cosine of an angle
	
**sin(degrees)**

	Take the sine of an angle
	
**tan(degrees)**

	Take the tangent of an angle
	
See also: **acos, asin, atan, atan2, radians, degrees, angleMode**

## Date & Time
**day() / month() / year()**

	Current date
	
**hour() / minute() / second()**

	Current time
	
**millis();**

	Milliseconds elapsed since program start

## Debugging
**debug(arg1, arg2, ...)**

	Print to your browser's developer console 
	
**print(data)**

	Print to the canvas console


## JavaScript
**var drawWinston = function() { };**

	Define a new function
	
**if (x < 20) { ... }**

	Only run code if a certain condition is true
	
**while (x < 250) { ... }**

	Only run code while a certain condition is true
	
**for (var i = 0; i < 8; i++) { }**

	Repeat code a fixed number of times
	
**var array = [0, 1, 2, 3, 4];**

	Make an array of 5 numbers


Our documentation does not cover the many ways to use JavaScript. Learn more at:

* Mozilla Developer Network: JavaScript Guide

* W3Schools JavaScript Tutorial

* Codecademy JS Lessons

This reference is based on ProcessingJS reference and is licensed under the CC BY-NC-SA 2.0 license.
