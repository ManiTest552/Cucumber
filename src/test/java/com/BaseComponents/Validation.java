package com.BaseComponents;

import org.testng.annotations.Test;

public class Validation {

	
	@Test
	public void validations() {
		
		String str = "Water (Aqua),Lauramidopropyl Betaine, Sodium C14-16 Olefin Sulfonate, Acrylates Copolymer, Sodium Methyl Cocoyl Taurate, Sodium Cocoamphoacetate, Guar Hydroxypropyltrimonium Chloride, Cinnamidopropyltrimonium Chloride, Stearyldimoniumhydroxypropyl Decylglucosides Chloride, Polyquaternium-11, Pisum Sativum (Pea) Extract, Acetyl Tetrapeptide-3, Trifolium Pratense (Clover) Flower Extract, Limnanthes Alba (Meadowfoam) Seed Oil, Crambe Abyssinica Seed Oil, Camellia Oleifera Seed Oil, Solanum Lycopersicum (Tomato) Seed Oil, Daucus Carota Sativa (Carrot) Seed Oil, Citrus Limon (Lemon) Peel Oil, Citrus Aurantifolia (Lime) Oil, Citrus Aurantium Bergamia (Bergamot) Fruit Oil, Adansonia Digitata Oil, Mauritia Flexuosa Fruit Oil, Cocos Nucifera (Coconut) Oil, Gardenia Tahitensis Flower Extract, Moringa Oleifera Seed Oil, Caryocar Brasiliense Fruit Oil, Helianthus Annuus (Sunflower) Seed Oil, Glycerin, Tocopherol, Dextran, Citric Acid, Propanediol, Glycol Distearate, Cocamidopropyl Hydroxysultaine, Sodium Hydroxypropylphosphate ";
		String expected ="Water (Aqua),Lauramidopropyl Betaine, Sodium C14-16 Olefin Sulfonate, Acrylates Copolymer, Sodium Methyl Cocoyl Taurate, Sodium Cocoamphoacetate, Guar Hydroxypropyltrimonium Chloride, Cinnamidopropyltrimonium Chloride, Stearyldimoniumhydroxypropyl Decylglucosides Chloride, Polyquaternium-11, Pisum Sativum (Pea) Extract, Acetyl Tetrapeptide-3, Trifolium Pratense (Clover) Flower Extract, Limnanthes Alba (Meadowfoam) Seed Oil, Crambe Abyssinica Seed Oil, Camellia Oleifera Seed Oil, Solanum Lycopersicum (Tomato) Seed Oil, Daucus Carota Sativa (Carrot) Seed Oil, Citrus Limon (Lemon) Peel Oil, Citrus Aurantifolia (Lime) Oil, Citrus Aurantium Bergamia (Bergamot) Fruit Oil, Adansonia Digitata Oil, Mauritia Flexuosa Fruit Oil, Cocos Nucifera (Coconut) Oil, Gardenia Tahitensis Flower Extract, Moringa Oleifera Seed Oil, Caryocar Brasiliense Fruit Oil, Helianthus Annuus (Sunflower) Seed Oil, Glycerin, Tocopherol, Dextran, Citric Acid, Propanediol, Glycol Distearate, Cocamidopropyl Hydroxysultaine, Sodium Hydroxypropylphosphate ";
		
		
		String str1 =" Nałóż małą ilość na dłoń, a następnie dokładnie rozetrzyj w dłoniach przed nałożeniem na mokre włosy.Delikatnie wmasuj w skórę głowy i włosy aż po końcówki do uzyskania obfitej piany.\r\n" + 
				"Pozostaw na włosach przez 2–3 minuty.\r\n" + 
				"Dokładnie spłucz, w razie potrzeby powtórz.\r\n" + 
				"Następnie zastosuj Kurację MONAT Intense Repair.\r\n" + 
				"Dla osiągnięcia najlepszych rezultatów stosuj z innymi produktami MONAT";
		
		String str2 ="Nałóż małą ilość na dłoń, a następnie dokładnie rozetrzyj w dłoniach przed nałożeniem na mokre włosy.\r\n" + 
				"Delikatnie wmasuj w skórę głowy i włosy aż po końcówki do uzyskania obfitej piany.\r\n" + 
				"Pozostaw na włosach przez 2–3 minuty.\r\n" + 
				"Dokładnie spłucz, w razie potrzeby powtórz.\r\n" + 
				"Następnie zastosuj Kurację MONAT Intense Repair.\r\n" + 
				"Dla osiągnięcia najlepszych rezultatów stosuj z innymi produktami MONAT";
		
		
		
		String ss ="Aqua/Water/Eau, Lauramidopropyl Betaine, Sodium C14-16 Olefin Sulfonate, Guar Hydroxypropyltrimonium Chloride, Acrylates Copolymer, Sodium Methyl Cocoyl Taurate, Sodium Cocoamphoacetate, Stearyldimoniumhydroxypropyl Decylglucosides Chloride, Pisum Sativum (Pea) Extract, Acetyl Tetrapeptide-3, Trifolium Pratense (Clover) Flower Extract, Limnanthes Alba (Meadowfoam) Seed Oil, Crambe Abyssinica Seed Oil, Camellia Oleifera Seed Oil, Solanum Lycopersicum (Tomato) Seed Oil, Daucus Carota Sativa (Carrot) Seed Oil, Citrus Limon (Lemon) Peel Oil, Citrus Aurantifolia (Lime) Oil, Citrus Aurantium Bergamia (Bergamot) Fruit Oil, Adansonia Digitata Oil, Mauritia Flexuosa Fruit Oil, Cocos Nucifera (Coconut) Oil, Gardenia Taitensis Flower Extract, Moringa Oleifera Seed Oil, Caryocar Brasiliense Fruit Oil, Helianthus Annuus (Sunflower) Seed Oil, Mentha Piperita (Peppermint) Oil, Mentha Arvensis Leaf Oil, Eucalyptus Globulus Leaf Oil, Mentha Viridis (Spearmint) Leaf Oil, Thymus Vulgaris (Thyme) Oil, Lavandula Angustifolia (Lavender) Oil, Glycerin, Tocopherol, Menthol, Cinnamidopropyltrimonium Chloride, Dextran, Propanediol, Glycol Distearate, Sodium Hydroxypropylphosphate Decylglucoside Crosspolymer, Lauramide MIPA, Sodium Hydroxypropylphosphate Laurylglucoside Crosspolymer, Cocamidopropyl Betaine, Butylene Glycol, Oleth-5 Phosphate, Dioleyl Phosphate, Cocamidopropyl Hydroxysultaine, Citric Acid, Trideceth-12, Cetrimonium Chloride, Amodimethicone, Aminomethyl Propanol, Phenethyl Alcohol, Undecyl Alcohol, Benzyl Alcohol";
		String SSS="Aqua/Water/Eau, Lauramidopropyl Betaine, Sodium C14-16 Olefin Sulfonate, Guar Hydroxypropyltrimonium Chloride, Acrylates Copolymer, Sodium Methyl Cocoyl Taurate, Sodium Cocoamphoacetate, Stearyldimoniumhydroxypropyl Decylglucosides Chloride, Pisum Sativum (Pea) Extract, Acetyl Tetrapeptide-3, Trifolium Pratense (Clover) Flower Extract, Limnanthes Alba (Meadowfoam) Seed Oil, Crambe Abyssinica Seed Oil, Camellia Oleifera Seed Oil, Solanum Lycopersicum (Tomato) Seed Oil, Daucus Carota Sativa (Carrot) Seed Oil, Citrus Limon (Lemon) Peel Oil, Citrus Aurantifolia (Lime) Oil, Citrus Aurantium Bergamia (Bergamot) Fruit Oil, Adansonia Digitata Oil, Mauritia Flexuosa Fruit Oil, Cocos Nucifera (Coconut) Oil, Gardenia Taitensis Flower Extract, Moringa Oleifera Seed Oil, Caryocar Brasiliense Fruit Oil, Helianthus Annuus (Sunflower) Seed Oil, Mentha Piperita (Peppermint) Oil, Mentha Arvensis Leaf Oil, Eucalyptus Globulus Leaf Oil, Mentha Viridis (Spearmint) Leaf Oil, Thymus Vulgaris (Thyme) Oil, Lavandula Angustifolia (Lavender) Oil, Glycerin, Tocopherol, Menthol, Cinnamidopropyltrimonium Chloride, Dextran, Propanediol, Glycol Distearate, Sodium Hydroxypropylphosphate Decylglucoside Crosspolymer, Lauramide MIPA, Sodium Hydroxypropylphosphate Laurylglucoside Crosspolymer, Cocamidopropyl Betaine, Butylene Glycol, Oleth-5 Phosphate, Dioleyl Phosphate, Cocamidopropyl Hydroxysultaine, Citric Acid, Trideceth-12, Cetrimonium Chloride, Amodimethicone, Aminomethyl Propanol, Phenethyl Alcohol, Undecyl Alcohol, Benzyl Alcohol";
		
		String the =   "Przed użyciem mocno wstrząsnąć pojemnikiem i rozpylać równomiernie u nasady włosów z odległości 25–30 cm.\r\n" + 
				"\r\n" + 
				"Pozostaw do wyschnięcia na 1–2 minuty, a następnie dokładnie przeczesz włosy palcami lub szczotką.\r\n" + 
				"\r\n" + 
				"Aby nadać dodatkowej objętości, użyj suszarki skierowanej w stronę nasady włosów.";
		String expthe= "Przed użyciem mocno wstrząsnąć pojemnikiem i rozpylać równomiernie u nasady włosów z odległości 25–30 cm.\r\n" + 
				"Pozostaw do wyschnięcia na 1–2 minuty, a następnie dokładnie przeczesz włosy palcami lub szczotką.\r\n" + 
				"Aby nadać dodatkowej objętości, użyj suszarki skierowanej w stronę nasady włosów.";
		
		if(str.equals(expected)) {
			System.out.println("matched");
		}else {
		System.out.println("not matched");
		}
		}
		
	 
		
 
}
