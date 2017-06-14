package modelo;

public abstract class Avion {
		
		public float grados;
		public boolean despegue= false;
		public boolean aterrizaje= true;
		public String rodar;
		public String esquivarN;
		public String esquivarM;
		public int peso;
		public float valor;
		public boolean supersonico;
		public int potencia;
		public int cantidadMisles;
		
		
				public boolean getDespegue() {
					return despegue;
				}
				public void setDespegue(boolean despegue) {
					this.despegue = despegue;
				}
				public boolean getAterrizaje() {
					return aterrizaje;
				}
				public void setAterrizaje(boolean aterrizaje) {
					this.aterrizaje = aterrizaje;
				}
				public String getRodar() {
					return rodar;
				}
				public void setRodar(String rodar) {
					this.rodar = rodar;
				}
				public String getEsquivarN() {
					return esquivarN;
				}
				public void setEsquivarN(String esquivarN) {
					this.esquivarN = esquivarN;
				}
				public String getEsquivarM() {
					return esquivarM;
				}
				public void setEsquivarM(String esquivarM) {
					this.esquivarM = esquivarM;
				}
				public int getPeso() {
					return peso;
				}
				public void setPeso(int peso) {
					this.peso = peso;
				}
				public float getValor() {
					return valor;
				}
				public void setValor(float valor) {
					this.valor = valor;
				}
				public boolean getSupersonico() {
					return supersonico;
				}
				public void setSupersonico(boolean supersonico) {
					this.supersonico = supersonico;
				}
				public int getPotencia() {
					return potencia;
				}
				public void setPotencia(int potencia) {
					this.potencia = potencia;
				}
				public int getCantidadMisles() {
					return cantidadMisles;
				}
				public void setCantidadMisles(int cantidadMisles) {
					this.cantidadMisles = cantidadMisles;
				}
				public float getGrados() {
					return grados;
				}
				public void setGrados(float grados) {
					this.grados = grados;
				}
		
	}
	

