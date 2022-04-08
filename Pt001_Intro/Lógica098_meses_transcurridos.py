# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	print("Digite el año de inicio: ")
	agnioinicio = float(input())
	print("Digite el año final: ")
	agniofinal = float(input())
	meses = (agniofinal-agnioinicio)*12
	print("La cantidad de meses transcurridos entre ",agnioinicio," y ",agniofinal," es ",meses," meses.")

