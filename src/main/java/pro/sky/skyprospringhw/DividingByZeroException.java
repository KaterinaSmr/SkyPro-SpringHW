package pro.sky.skyprospringhw;

public class DividingByZeroException extends IllegalArgumentException{
    public DividingByZeroException() {
        super("На ноль делить нельзя");
    }
}
