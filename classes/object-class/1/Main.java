public final class ComplexNumber {
  private final double re;
  private final double im;

  public ComplexNumber(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public double getRe() {
    return re;
  }

  public double getIm() {
    return im;
  }

  @Override
  public int hashCode() {
    int result = 17;
    long longRe = Double.doubleToLongBits(this.getRe());
    long longIm = Double.doubleToLongBits(this.getIm());

    result = 31 * result + (int) (longRe ^ (longRe >>> 31));
    result = 31 * result + (int) (longIm ^ (longIm >>> 31));

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof ComplexNumber)) {
      return false;
    }

    ComplexNumber complexNumber = (ComplexNumber) obj;

    return this.getRe() == complexNumber.getRe() && this.getIm() == complexNumber.getIm();
  }
}
