/*
 *未来の開発者様へ
 *私はCharacterクラス開発者、ミナトです。
 *
 *このクラスは、普通のクラスのようにnewして使うためのものでは
 *ありません。HeroやWizardなどの職業クラスを皆様が作る際に
 *少しでもラクができるように、全職業クラスに共通するフィールド
 *やメソッドを備えた「継承の材料」です。
 *
 *このクラスを継承して、必要なフィールドやメソッドを追加する
 *ことで、それぞれの職業クラスを完成させてください。
 *逆に言えば、このCharacterクラスは、それ自体では未完成の
 *クラスです。例えばattackメソッドは中身が確定できないので
 *空にしてあります。
 *よって、このクラスをnewして実際に利用（冒険させたり
 *戦闘させたり）しないでください。不具合の原因になります。
 */

public abstract class Character{
  String name;
  int hp;
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  //戦う
  public abstract void attack(Matango m);
}
