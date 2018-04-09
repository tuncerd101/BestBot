package Hots.HotsMain;

import java.util.ArrayList;
import java.util.List;

import Hots.HotsTalentTiers.Tier1;
import Hots.HotsTalentTiers.Tier2;
import Hots.HotsTalentTiers.Tier3;
import Hots.HotsTalentTiers.Tier4;
import Hots.HotsTalentTiers.Tier5;
import Hots.HotsTalentTiers.Tier6;
import Hots.HotsTalentTiers.Tier7;

public class Heroes {

	private static List<String> t1 = new ArrayList<>();
	private static List<String> t2 = new ArrayList<>();
	private static List<String> t3 = new ArrayList<>();
	private static List<String> t4 = new ArrayList<>();
	private static List<String> t5 = new ArrayList<>();
	private static List<String> t6 = new ArrayList<>();
	private static List<String> t7 = new ArrayList<>();

	public static Hero createAbathur() {
		t1.add("Pressurized Glands");
		t1.add("Survival Instincts");
		t1.add("Regenerative Microbes");
		t1.add("Envenomed Nest");
		t2.add("Prolific Dispersal");
		t2.add("Ballistospores");
		t2.add("Sustained Carapace");
		t2.add("Adrenal Overload");
		t3.add("Needlespine");
		t3.add("Vile Nest");
		t3.add("Networked Carapace");
		t3.add("Calldown: Mule");
		t4.add("Ultimate Evolution");
		t4.add("Evolve Monstrosity");
		t5.add("Assault Strain");
		t5.add("Bombard Strain");
		t5.add("Spatial Efficiency");
		t5.add("Soma Transference");
		t6.add("Envonemed Spikes");
		t6.add("Adrenaline Boost");
		t6.add("Locust Brood");
		t6.add("Volatile Mutation");
		t7.add("Evolutionary Link");
		t7.add("Evolution Complete");
		t7.add("Hivemind");
		t7.add("Locust Nest");

		return new Hero("Abathur", new Talents(new Tier1(t1), new Tier2(t2), new Tier3(t3), new Tier4(t4),
				new Tier5(t5), new Tier6(t6), new Tier7(t7)));
	}

	public static Hero createAlarak() {

		t1.add("Sustaining Power");
		t1.add("Extended Lightning");
		t1.add("Ruthless Momentum");
		t2.add("Chaos Reigns");
		t2.add("Negatvely Charged");
		t2.add("Show of Force");
		t3.add("Dissonance");
		t3.add("Hindered Motion");
		t3.add("Applied Force");
		t4.add("Deadly Charge");
		t4.add("Counter-Strike");
		t5.add("Blade of the Highlord");
		t5.add("Pure Malice");
		t5.add("Rite of Rak'shir");
		t6.add("Lethal Onslaught");
		t6.add("Lightning Barrage");
		t6.add("Mocking Strikes");
		t7.add("Counter-Strike");
		t7.add("Deadly Charge");
		t7.add("Last Laugh");
		t7.add("Hasty Bargain");
		return new Hero("Alarak", new Talents(new Tier1(t1), new Tier2(t2), new Tier3(t3), new Tier4(t4), new Tier5(t5),
				new Tier6(t6), new Tier7(t7)));
	}

	public static Hero createAlexstrasza() {

		t1.add("Live and Let Live");
		t1.add("Circle of Life");
		t1.add("Flames of Fury");
		t2.add("Surge of Vitality");
		t2.add("Heat Exhaustion");
		t2.add("Exuberance");
		t3.add("Lifeblossom");
		t3.add("Verdant Flourish");
		t3.add("Fire Within");
		t4.add("Life-Binder");
		t4.add("Cleansing Flame");
		t5.add("Drago Scales");
		t5.add("Pacify");
		t5.add("Life Unbound");
		t6.add("Tough Love");
		t6.add("Overprotevtive");
		t6.add("Dragonic Discipline");
		t7.add("Ritual of Life");
		t7.add("On Ruby Wings");
		t7.add("Ancient Flame");
		t7.add("Blessing of the Red");
		return new Hero("Alexstrasza", new Talents(new Tier1(t1), new Tier2(t2), new Tier3(t3), new Tier4(t4),
				new Tier5(t5), new Tier6(t6), new Tier7(t7)));
	}

	public static Hero createAna() {

		t1.add("Grenade Calibration");
		t1.add("Piercing Darts");
		t1.add("Detachable Box Magazine");
		t2.add("Air Strike");
		t2.add("Overdose");
		t2.add("Aim Down Sights");
		t3.add("Temporary Blindness");
		t3.add("Mind-Numbing Agent");
		t3.add("Debilitating Dart");
		t4.add("Nano Boost");
		t4.add("Eye of Horus");
		t5.add("Speed Serum");
		t5.add("Prifying Darts");
		t5.add("Smelling Salts");
		t6.add("Sharpshooter");
		t6.add("Concentrated Doses");
		t6.add("Contact Healing");
		t7.add("Nano Infusion");
		t7.add("Ballistic Advantage");
		t7.add("Somnolent Doses");
		t7.add("Dynamic SHooting");
		t7.add("Custom Optics");
		return new Hero("Ana", new Talents(new Tier1(t1), new Tier2(t2), new Tier3(t3), new Tier4(t4), new Tier5(t5),
				new Tier6(t6), new Tier7(t7)));

	}

	public static Hero creatAnubarak() {

		t1.add("Resilient Scarabs");
		t1.add("Nerubian Armor");
		t1.add("Regneration Master");
		t2.add("Bed of Barbs");
		t2.add("Shed Exoskeleton");
		t2.add("Underking");
		t2.add("Legion of Beetles");
		t3.add("Chitinous Platin");
		t3.add("Subterranean Shield");
		t3.add("Leeching Scarabs");
		t4.add("Locust Swarm");
		t4.add("Cocoon");
		t5.add("Burning Rage");
		t5.add("Urticating Spines");
		t5.add("Acid Drenched Mandibles");
		t6.add("Epicenter");
		t6.add("Debilitation");
		t6.add("Beetle, Juiced");
		t7.add("Hive Master");
		t7.add("Cryptweave");
		t7.add("Nullification Shield");
		t7.add("Rewind");
		return new Hero("Anub'arak", new Talents(new Tier1(t1), new Tier2(t2), new Tier3(t3), new Tier4(t4),
				new Tier5(t5), new Tier6(t6), new Tier7(t7)));

	}

	// vorlage
	public static Hero create() {

		t1.add("");
		t1.add("");
		t1.add("");
		t2.add("");
		t2.add("");
		t2.add("");
		t3.add("");
		t3.add("");
		t3.add("");
		t4.add("");
		t4.add("");
		t5.add("");
		t5.add("");
		t5.add("");
		t6.add("");
		t6.add("");
		t6.add("");
		t7.add("");
		t7.add("");
		t7.add("");
		t7.add("");

		return new Hero("", new Talents(new Tier1(t1), new Tier2(t2), new Tier3(t3), new Tier4(t4), new Tier5(t5),
				new Tier6(t6), new Tier7(t7)));

	}

}
