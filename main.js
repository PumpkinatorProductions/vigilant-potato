//has p.js min file in html.
//https://www.khanacademy.org/computer-programming/processingjs-inside-webpages-template/5157014494511104
/*
  Site for graphics dump.
  METHOD 1
  Good way to show graphics is to
  hide and show canvases that have
  pregenerated images, and then
  have a global varible called scene,
  to keep track of which to show.
  METHOD 2
  Create a single canvas and use the draw,
  and environment events.
*/
var sketchProc = function(processingInstance) {
  with (processingInstance) {
    size(400, 400); //screen size
    frameRate(30); //frame rate
    
    //varibles
    var bullets = 100;
    angleMode = "radians";
    
    // graphics
    fill(255, 255, 0);
    ellipse(200, 200, 200, 200);
    noFill();
    strokeWeight(2);
    arc(200, 200, 150, 100, 0, PI);
    fill(0, 0, 0);
    ellipse(250, 200, 10, 10);
    ellipse(153, 200, 10, 10);
    colorMode(HSB);
    // called each frame
    draw = function() {
      fill(Math.map(mouseX, 0, 400, 0, 255), Math.map(mouseY, 0, 400, 200, 300), 255);
      point(mouseX, mouseY);
    };
    mouseClicked = function() {
      bullets--;
    };
  }
};
// Get the canvas that Processing-js will use
var canvas = document.getElementById("mycanvas"); 
// Pass the function sketchProc (defined in myCode.js) to Processing's constructor.
var processingInstance = new Processing(canvas, sketchProc);

