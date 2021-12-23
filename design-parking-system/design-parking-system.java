class ParkingSystem {

    int bigSlots, mediumSlots, smallSlots;
    public ParkingSystem(int big, int medium, int small) {
        
        bigSlots = big;
        mediumSlots = medium;
        smallSlots = small;
        
    }
    
    public boolean addCar(int carType) {
        
        if(carType == 1) //Big
        {
            if(bigSlots > 0)
            {
                bigSlots--;
                return true;
            }else
            {
                return false;
            }
            
        }else if(carType == 2) //Medium
        {
            if(mediumSlots > 0)
            {
                mediumSlots--;
                return true;
            }else
            {
                return false;
            }
            
        }else 
        {
            if(smallSlots > 0)
            {
                smallSlots--;
                return true;
            }else
            {
                return false;
            }
            
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */