#
# Copyright (c) 2024 Gitar, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

import ldclient
from ldclient import Context


ldclient.set_config(Config("sdk-key-123abc"))
client = ldclient.get()

context = Context.builder("context-key-123abc").name("Sandy").build()
flag_value = client.variation("flag-key-123abc", context, False)
if flag_value:
   print("Flag enabled")
else:
   print("Flag disabled")


show_feature = ldclient.get().variation("flag-key-123abc", context, False)


detail = client.variation_detail("flag-key-123abc", my_context, False)
value = detail.value
index = detail.variation_index
reason = detail.reason
