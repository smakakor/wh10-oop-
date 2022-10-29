public class BouquetOfFlowers {
    private int amountFlower1;
    private int amountFlower2;
    private int amountFlower3;
    private int amountFlower4;

    BouquetOfFlowers(int amountFlower1,int amountFlower2,int amountFlower3,int amountFlower4){
        if (amountFlower1 > 0) {
            this.amountFlower1 = amountFlower1;
        } else {
            this.amountFlower1 = 0;
        }

        if (amountFlower2 > 0) {
            this.amountFlower2 = amountFlower2;
        } else {
            this.amountFlower2 = 0;
        }

        if (amountFlower3 > 0) {
            this.amountFlower3 = amountFlower3;
        } else {
            this.amountFlower3 = 0;

        }if (amountFlower4 > 0) {
            this.amountFlower4 = amountFlower4;
        } else {
            this.amountFlower4 = 0;
        }
        




    }


}

