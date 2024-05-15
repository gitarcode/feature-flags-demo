import ldclient
from ldclient import Context

ldclient.set_config(Config("sdk-key-123abc"))
client = ldclient.get()

# Test variation
context = Context.builder("context-key-123abc").name("Sandy").build()
flag_value = client.variation("flag-key-123abc", context, False)
if flag_value:
   print("Flag enabled")
else:
   print("Flag disabled")

