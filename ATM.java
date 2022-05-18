package com.kova;

public class ATM {

    private int twentyBanknotes;
    private int fiftyBanknotes;
    private int hundredBanknotes;

    public ATM(int twentyBanknotes, int fiftyBanknotes, int hundredBanknotes) {
        this.twentyBanknotes = twentyBanknotes;
        this.fiftyBanknotes = fiftyBanknotes;
        this.hundredBanknotes = hundredBanknotes;
    }

    public void replenishment(int addTwentyBanknotes, int addFiftyBanknotes, int addHundredBanknotes){

        twentyBanknotes += addTwentyBanknotes;
        fiftyBanknotes += addFiftyBanknotes;
        hundredBanknotes += addHundredBanknotes;

        System.out.println("Общая сумма пополнения: " + (addTwentyBanknotes * 20 + addFiftyBanknotes * 50 +
                addHundredBanknotes * 100));
    }

    public boolean withdrawal(int addTwentyBanknotes, int addFiftyBanknotes, int addHundredBanknotes){

        boolean value = false;

        if(addTwentyBanknotes <= twentyBanknotes && addFiftyBanknotes <= fiftyBanknotes &&
                addHundredBanknotes <= hundredBanknotes) {

            cassetteTwenty(addTwentyBanknotes);
            cassetteFifty(addFiftyBanknotes);
            cassetteHundred(addHundredBanknotes);

            System.out.println("Общая сумма снятых банкнот: " + (addTwentyBanknotes * 20 + addFiftyBanknotes * 50 +
                    addHundredBanknotes * 100));
            value = true;
        }
        return value;
    }

    private void cassetteTwenty(int addTwentyBanknotes){

        if (addTwentyBanknotes > 0){
            twentyBanknotes -= addTwentyBanknotes;
            System.out.println("Вы сняли " + addTwentyBanknotes + " банкнот номиналом 20 рублей, в сумме " +
                    addTwentyBanknotes * 20);
        }

    }

    private void cassetteFifty(int addFiftyBanknotes){

        if (addFiftyBanknotes > 0){
            fiftyBanknotes -= addFiftyBanknotes;
            System.out.println("Вы сняли " + addFiftyBanknotes + " банкнот номиналом 50 рублей, в сумме " +
                    addFiftyBanknotes * 50);
        }
    }

    private void cassetteHundred(int addHundredBanknotes){

        if (addHundredBanknotes > 0) {
            hundredBanknotes -= addHundredBanknotes;
            System.out.println("Вы сняли " + addHundredBanknotes + " банкнот номиналом 100 рублей, в сумме " +
                    addHundredBanknotes * 100);
        }
    }

}
