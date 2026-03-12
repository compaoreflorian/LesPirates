package TestPirates;

	public class Inversion extends CaseSpeciale {
		private int numero;
		private IAffichage journal = new JournalOnePiece();
		private De de = new De();

		public Inversion(int numero) {
			this.numero = numero;
		}

		public int getNumero() {
			return numero;
		}

		@Override
		public void appliquerEffet(Joueur joueur, Pion pion1, Pion pion2) {
			int position1 = pion1.getPosition();
			int position2 = pion2.getPosition();
			pion2.teleporter(position1);
			pion1.teleporter(position2);
			journal.afficherinversion(position2);
		}
	}

