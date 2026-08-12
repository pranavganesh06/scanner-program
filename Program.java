import java.util.Scanner;
import java.io.IOException;

public class ValorantAgents {
    public static void main(String[] args) throws IOException {

        // Create a Scanner to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the name of a VALORANT agent.
        System.out.println("Enter a VALORANT agent:");
        String agent = scanner.nextLine().trim();

        // Check the entered agent name and print that agent's official Riot biography.
        if (agent.equalsIgnoreCase("Astra")) {
            System.out.println("Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she's always eons ahead of her enemy's next move.");

        } else if (agent.equalsIgnoreCase("Breach")) {
            System.out.println("Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.");

        } else if (agent.equalsIgnoreCase("Brimstone")) {
            System.out.println("Joining from the U.S.A., Brimstone's orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and safely make him the unmatched boots-on-the-ground commander.");

        } else if (agent.equalsIgnoreCase("Chamber")) {
            System.out.println("Well-dressed and well-armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan.");

        } else if (agent.equalsIgnoreCase("Clove")) {
            System.out.println("Scottish troublemaker Clove makes mischief for enemies in both the heat of battle and the cold of death. The young immortal keeps foes guessing, even from beyond the grave, their return to living only ever a moment away.");

        } else if (agent.equalsIgnoreCase("Cypher")) {
            System.out.println("The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy's every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.");

        } else if (agent.equalsIgnoreCase("Deadlock")) {
            System.out.println("Norwegian operative Deadlock deploys an array of cutting-edge nanowire to secure the battlefield from even the most lethal assault. No one escapes her vigilant watch, nor survives her unyielding ferocity.");

        } else if (agent.equalsIgnoreCase("Fade")) {
            System.out.println("Turkish bounty hunter, Fade, unleashes the power of raw nightmares to seize enemy secrets. Attuned with terror itself, she hunts targets and reveals their deepest fears—before crushing them in the dark.");

        } else if (agent.equalsIgnoreCase("Gekko")) {
            System.out.println("Gekko the Angeleno leads a tight-knit crew of calamitous creatures. His buddies bound forward, scattering enemies out of the way, with Gekko chasing them down to regroup and go again.");

        } else if (agent.equalsIgnoreCase("Harbor")) {
            System.out.println("Hailing from India’s coast, Harbor storms the field wielding ancient technology with dominion over water. He unleashes frothing rapids and crushing waves to shield his allies, or pummel those that oppose him.");

        } else if (agent.equalsIgnoreCase("Iso")) {
            System.out.println("Chinese fixer for hire, Iso falls into a flow state to dismantle the opposition. Reconfiguring ambient energy into bulletproof protection, he advances with focus towards his next duel to the death.");

        } else if (agent.equalsIgnoreCase("Jett")) {
            System.out.println("Representing her home country of South Korea, Jett's agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies before they even know what hit them.");

        } else if (agent.equalsIgnoreCase("KAY/O")) {
            System.out.println("KAY/O is a machine of war built for a single purpose: neutralizing radiants. His power to Suppress enemy abilities dismantles his opponents' capacity to fight back, securing him and his allies the ultimate edge.");

        } else if (agent.equalsIgnoreCase("Killjoy")) {
            System.out.println("The genius of Germany. Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn't stop her enemies, her robots' debuff will help make short work of them.");

        } else if (agent.equalsIgnoreCase("Miks")) {
            System.out.println("Straight from Croatia, Miks takes the stage channeling pure sound energy. With his infectious passion and sonic powers, he rallies his squad to move as one as they set the tempo on the battlefield together.");

        } else if (agent.equalsIgnoreCase("Neon")) {
            System.out.println("Filipino Agent Neon surges forward at shocking speeds, discharging bursts of bioelectric radiance as fast as her body generates it. She races ahead to catch enemies off guard, then strikes them down quicker than lightning.");

        } else if (agent.equalsIgnoreCase("Omen")) {
            System.out.println("A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next.");

        } else if (agent.equalsIgnoreCase("Phoenix")) {
            System.out.println("Hailing from the U.K., Phoenix's star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he's got backup or not, he'll rush into a fight on his own terms.");

        } else if (agent.equalsIgnoreCase("Raze")) {
            System.out.println("Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of 'boom.'");

        } else if (agent.equalsIgnoreCase("Reyna")) {
            System.out.println("Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance.");

        } else if (agent.equalsIgnoreCase("Sage")) {
            System.out.println("The stronghold of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight.");

        } else if (agent.equalsIgnoreCase("Skye")) {
            System.out.println("Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye’s side.");

        } else if (agent.equalsIgnoreCase("Sova")) {
            System.out.println("Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.");

        } else if (agent.equalsIgnoreCase("Tejo")) {
            System.out.println("A veteran intelligence consultant from Colombia, Tejo's ballistic guidance system pressures the enemy to relinquish their ground - or their lives. His targeted strikes keep opponents off balance and under his heel.");

        } else if (agent.equalsIgnoreCase("Veto")) {
            System.out.println("Empowered by an unstoppable DNA mutation, Senegalese enforcer Veto defies the rules of engagement by nullifying his opponent's powers and technology. On Veto's battlefield, gunplay is your only guarantee.");

        } else if (agent.equalsIgnoreCase("Viper")) {
            System.out.println("The American Chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and choke the enemy's vision. If the toxins don't kill her prey, her mindgames surely will.");

        } else if (agent.equalsIgnoreCase("Vyse")) {
            System.out.println("Metallic mastermind Vyse unleashes liquid metal to isolate, trap, and disarm her enemies. Through cunning and manipulation, she forces all who oppose her to fear the battlefield itself.");

        } else if (agent.equalsIgnoreCase("Waylay")) {
            System.out.println("Thailand's prismatic radiant Waylay transforms into light itself as she darts across the battlefield, striking down her targets through shards of light before flitting back to safety, all in the blink of an eye.");

        } else if (agent.equalsIgnoreCase("Yoru")) {
            System.out.println("Japanese native, Yoru, rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal measure, he gets the drop on each target before they know where to look.");

        } else {
            // This runs if the entered name does not match any current agent.
            System.out.println("Agent not found.");
        }

        // Close the Scanner when it is no longer needed.
        scanner.close();
    }
}
