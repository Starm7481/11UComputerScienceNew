package Starfield;

class Star {

    float x;
    float y;
    float z;

    Star() {
        x = random(-width, width);
        y = random(-height, height);
        z = random(0, width);
    }

    void update() {
        z = z -1; 
        if (z < 1){
            z = widht;
             x = random(-width, width);
        y = random(-height, height);
        }
    }

    void show() {
        fill(255);
        noStroke();

        float sx = map(x / z, 0, 1, 0, width);
        float sy = map(y / z, 0, 1, 0, height);

        ellipse(sx, sy, 8, 8);
    }
}
