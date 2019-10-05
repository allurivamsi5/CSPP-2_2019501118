 class Dog{
    public static void main(String[] args){
        details puppy = new details("micky","abc","white",13);
        System.out.println(puppy.toString());
    }
    }
    class details{
        String name;
        String breed;
        String colour;
        int age;
        details(String name,String breed,String colour,int age ){
            this.name =  name;
            this.breed = breed;
            this.colour = colour;
            this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setBreed(String breed){
            this.breed = breed;
        }
        public void  setColour(String colour){
            this.colour = colour;
        }
        public void  setAge(int age){
            this.age = age;
        }
        public String getName(){
            return this.name;
        }
        public String getBreed(){
            return this.breed;
        }
        public String getColour(){
            return this.colour;
        }
        public int getAge(){
            return this.age;
        }
        public String toString(){
            return("Hi my name is "+ this.getName()+ 
               ".\nMy breed,age and color are " + 
               this.getBreed()+"," + this.getColour()+ 
               ","+ this.getAge()); 
    
        }

    }
