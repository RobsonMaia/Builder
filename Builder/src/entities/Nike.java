package entities;

public class Nike {

	private final String name;
	private final String color;
	private final double size;

	private Nike(Builder builder) {
		this.name = builder.name;
		this.color = builder.color;
		this.size = builder.size;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}
	
	public double getSize() {
		return size;
	}

	public static class Builder {
		private String name;
		private String color;
		private double size;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder color(String color) {
			this.color = color;
			return this;
		}
		
		public Builder size(double size) {
			this.size = size;
			return this;
		}

		public Nike build() {
			return new Nike(this);
		}
	}
}
