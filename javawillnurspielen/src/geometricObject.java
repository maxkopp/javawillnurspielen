
public class geometricObject {
	
	public Vertex pos;
	public double height;
	public double width;
	public double heigth;

	public geometricObject(double w, double h, Vertex pos) {
		this.pos=pos;
		this.width=w;
		this.heigth=h;
	}

	public double getheigth() {return height;}
	public double getWidth() { return width;}

	public Vertex getPos () {return pos;}


	}

