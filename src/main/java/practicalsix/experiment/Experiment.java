package practicalsix.experiment;

import practicalsix.computation.IterativeFactorialComputation;
import practicalsix.computation.RecursiveFactorialComputation;
import practicalsix.data.ResultsTable;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds depending on the strategy.
 *
 * @author Gregory M. Kapfhammer
 */

public class Experiment {

  /** The campaign length for the RecursiveFactorialComputation. */
  private static final int RECURSIVE_FACTORIAL_CAMPAIGN_LENGTH = 10;

  /** The campaign length for the IterativeFactorialComputation. */
  private static final int ITERATIVE_FACTORIAL_CAMPAIGN_LENGTH = 10;

  /** Run the recursive experiment. */
  public static void runRecursiveExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    // Create a RecursiveFactorialComputation and run it in a campaign
    RecursiveFactorialComputation recursiveFactorial = new RecursiveFactorialComputation();
    ResultsTable recursiveFactorialResultsTable =
        runComputationCampaign.run(recursiveFactorial, RECURSIVE_FACTORIAL_CAMPAIGN_LENGTH);
    System.out.println();
    System.out.println("Results of an experiment campaign with "
                       + recursiveFactorial.getName() + ":\n");
    System.out.println(recursiveFactorialResultsTable.toString());
    System.out.println();
  }

  /** Run the iterative experiment. */
  public static void runIterativeExperiment() {
    // TODO: Add in the implementation of the iterative experiment
  }

  /** Run the experiment campaigns for a different number of rounds. */
  public static void main(String[] args) {
    runIterativeExperiment();
    runRecursiveExperiment();
  }

}
