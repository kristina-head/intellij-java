abstract class Shape {

  abstract double getPerimeter();

  abstract double getArea();
}

class Triangle extends Shape {
  double a;
  double b;
  double c;

  Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  double getPerimeter() {
    return this.a + this.b + this.c;
  }

  @Override
  double getArea() {
    double p = getPerimeter() / 2;
    return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
  }
}

class Rectangle extends Shape {
  double a;
  double b;

  Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  double getPerimeter() {
    return (this.a * 2) + (this.b * 2);
  }

  @Override
  double getArea() {
    return this.a * this.b;
  }
}

class Circle extends Shape {
  double r;

  Circle(double r) {
    this.r = r;
  }

  @Override
  double getPerimeter() {
    return Math.PI * (this.r * 2);
  }

  @Override
  double getArea() {
    return Math.PI * Math.pow(this.r, 2);
  }
}
