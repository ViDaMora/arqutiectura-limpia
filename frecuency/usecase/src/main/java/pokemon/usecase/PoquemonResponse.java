package pokemon.usecase;

import pokemon.usecase.base.UseCase;

public class PoquemonResponse extends UseCase<PoquemonResponse.Request, PoquemonResponse.Response>{
    public static class Request implements UseCase.RequestValues {
        private final byte[] input;
        private final String name;

        public Request(String name, byte[] input) {
            this.input = input;
            this.name = name;
        }
    }

    public static class Response implements UseCase.ResponseValue {
        private final byte[] output;
        private final String status;

        public Response(byte[] output, String status) {
            this.status = status;
            this.output = output;
        }

        public String getResult() {
            return status;
        }
    }
}
