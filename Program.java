import java.util.Scanner;
import java.IO.IOException;
import java.util.ArrayList;

public class ValorantAgents {

    /**
     * Represents a Valorant agent and stores information about all created agents.
     */
    static class Agent {
        private static ArrayList<Agent> list = new ArrayList<Agent>();
        private String Name;
        private String Bio;

        public Agent(String Name, String Bio) {
            this.Name = Name;
            this.Bio = Bio;
            list.add(this);
        }

        /**
         * Returns the biography of the agent.
         *
         * @return the agent's biography
         */
        public String getBio() {
            return Bio;
        }

        /**
         * Searches for an agent by name and returns their biography.
         *
         * @param name the name of the agent to search for
         * @return the agent's biography, or "Agent not found." if no matching agent exists
         */
        public static String findBio(String name) {
            for (int i = 0; i < list.size(); i++) {
                if (name.equalsIgnorCase(list.get(i))) {
                    return list.get(i).getBio();
                }
            }
            return "Agent not found.";
        }
    }
}
    public static void main(String[] args) throws IOException {
        new Agent("Astra", "Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she's always eons ahead of her enemy's next move.");
        new Agent("Breach", "Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.");
        new Agent("Brimstone", "Joining from the U.S.A., Brimstone's orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and safely make him the unmatched boots-on-the-ground commander.");
        new Agent("Chamber", "Well-dressed and well-armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan.");
        new Agent("Clove", "Scottish troublemaker Clove makes mischief for enemies in both the heat of battle and the cold of death. The young immortal keeps foes guessing, even from beyond the grave, their return to living only ever a moment away.");
        new Agent("Cypher", "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy's every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.");
        new Agent("Deadlock", "Norwegian operative Deadlock deploys an array of cutting-edge nanowire to secure the battlefield from even the most lethal assault. No one escapes her vigilant watch, nor survives her unyielding ferocity.");
        new Agent("Fade", "Turkish bounty hunter, Fade, unleashes the power of raw nightmares to seize enemy secrets. Attuned with terror itself, she hunts targets and reveals their deepest fears—before crushing them in the dark.");
        new Agent("Gekko", "Gekko the Angeleno leads a tight-knit crew of calamitous creatures. His buddies bound forward, scattering enemies out of the way, with Gekko chasing them down to regroup and go again.");
        new Agent("Harbor", "Hailing from India’s coast, Harbor storms the field wielding ancient technology with dominion over water. He unleashes frothing rapids and crushing waves to shield his allies, or pummel those that oppose him.");
        new Agent("Iso", "Chinese fixer for hire, Iso falls into a flow state to dismantle the opposition. Reconfiguring ambient energy into bulletproof protection, he advances with focus towards his next duel to the death.");
        new Agent("Jett", "Representing her home country of South Korea, Jett's agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies before they even know what hit them.");
        new Agent("KAY/O", "KAY/O is a machine of war built for a single purpose: neutralizing radiants. His power to Suppress enemy abilities dismantles his opponents' capacity to fight back, securing him and his allies the ultimate edge.");
        new Agent("Killjoy", "The genius of Germany. Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn't stop her enemies, her robots' debuff will help make short work of them.");
        new Agent("Miks", "Straight from Croatia, Miks takes the stage channeling pure sound energy. With his infectious passion and sonic powers, he rallies his squad to move as one as they set the tempo on the battlefield together.");
        new Agent("Neon", "Filipino Agent Neon surges forward at shocking speeds, discharging bursts of bioelectric radiance as fast as her body generates it. She races ahead to catch enemies off guard, then strikes them down quicker than lightning.");
        new Agent("Omen", "A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next.");
        new Agent("Phoenix", "Hailing from the U.K., Phoenix's star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he's got backup or not, he'll rush into a fight on his own terms.");
        new Agent("Raze", "Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of 'boom.'");
        new Agent("Reyna", "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance.");
        new Agent("Sage", "The stronghold of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight.");
        new Agent("Skye", "Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye’s side.");
        new Agent("Sova", "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.");
        new Agent("Tejo", "A veteran intelligence consultant from Colombia, Tejo's ballistic guidance system pressures the enemy to relinquish their ground - or their lives. His targeted strikes keep opponents off balance and under his heel.");
        new Agent("Veto", "Empowered by an unstoppable DNA mutation, Senegalese enforcer Veto defies the rules of engagement by nullifying his opponent's powers and technology. On Veto's battlefield, gunplay is your only guarantee.");
        new Agent("Viper", "The American Chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and choke the enemy's vision. If the toxins don't kill her prey, her mindgames surely will.");
        new Agent("Vyse", "Metallic mastermind Vyse unleashes liquid metal to isolate, trap, and disarm her enemies. Through cunning and manipulation, she forces all who oppose her to fear the battlefield itself.");
        new Agent("Waylay", "Thailand's prismatic radiant Waylay transforms into light itself as she darts across the battlefield, striking down her targets through shards of light before flitting back to safety, all in the blink of an eye.");
        new Agent("Yoru", "Japanese native, Yoru, rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal measure, he gets the drop on each target before they know where to look.");

        // Create a Scanner to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the name of a VALORANT agent.
        System.out.println("Enter a VALORANT agent:");
        String agent = scanner.nextLine().trim();

        System.out.println(Agent.findBio(agent));

        // Close the Scanner when it is no longer needed.
        scanner.close();
    }
}
