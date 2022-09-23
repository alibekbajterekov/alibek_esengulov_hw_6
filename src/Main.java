public class Main {

    public static void main(String[] args) {
      Boss boss = new Boss();
      boss.setHealth(750);
      boss.setDamage(75);
      boss.setWeapon(new Weapon(WeaponType.Bazooka, "m1"));
        System.out.println(boss.info());

      Skeleton skeletonOne = new Skeleton();
      skeletonOne.setHealth(500);
      skeletonOne.setDamage(35);
      skeletonOne.setWeapon(new Weapon(WeaponType.Gun,"Shot Gun"));
      skeletonOne.setArrows(20);
      System.out.println(skeletonOne.info());

      Skeleton skeletonTwo = new Skeleton();
      skeletonTwo.setHealth(500);
      skeletonTwo.setDamage(50);
      skeletonTwo.setWeapon(new Weapon(WeaponType.Knife,"Butcher"));
      skeletonTwo.setArrows(15);
      System.out.println(skeletonTwo.info());
    }
}