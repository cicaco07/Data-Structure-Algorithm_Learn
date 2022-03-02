class Pacman {
    int x, y, width, height;
    
    void Left(int a){
        x -= 1;
    }

    void Right(int a){
        x += 1;
    }

    void Up(int a){
        y += 1;
    }

    void Down(int a){
        y -= 1;
    }

    void printPosition(int a, int b) {
        System.out.println("\nPacman pada posisi (x,y) = " + x + "," + y);
    }
}
