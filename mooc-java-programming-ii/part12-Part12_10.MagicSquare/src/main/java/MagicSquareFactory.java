
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        
        int mid = square.getWidth() / 2;
        int currentNum = 1;
        int x = mid;
        int y = 0;
        
        square.placeValue(x, y, currentNum);
        
        System.out.println("x: " + x + ", y: " + y);
        int counter = 0;    
        while (counter < size * size) {
            
            x++;
            y--;
            currentNum++;
            
            System.out.println("x: " + x + ", y: " + y);
            
            if (x >= square.getWidth() && y < 0) {
                x--;
                y += 2;
                square.placeValue(x, y, currentNum);             
            } else if (y < 0) {
                y = square.getHeight() - 1;
                square.placeValue(x, y, currentNum);
            } else if (x >= square.getWidth()) {
                x = 0;
                square.placeValue(x, y, currentNum);
            } else if (square.readValue(x, y) == 0) {
                square.placeValue(x, y, currentNum);
            } else {
                x--;
                y += 2;
                square.placeValue(x, y, currentNum);
            }   
            counter++;
        }
        
        return square;
    }

}
