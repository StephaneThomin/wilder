class Classroom {

    public static void main(String[] args) {
        
        Wilder stephane = new Wilder ("Stéphane");
        System.out.println(stephane.whoAmI());

        Wilder ghost = new Wilder ("Ghost" , false);
        System.out.println(ghost.whoAmI());
    }
}